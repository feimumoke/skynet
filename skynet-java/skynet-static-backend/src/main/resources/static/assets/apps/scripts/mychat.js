layui.define(['jquery', 'layim', 'element'], function (exports) {
    console.log("nav chat");
    layim = layui.layim;
    var userId = 1;
    var socket = null;  // 判断当前浏览器是否支持WebSocket
    var address = "ws://localhost:8989/ws";
    if (!window.WebSocket) {
        window.WebSocket = window.MozWebSocket;
    }
    if (window.WebSocket) {
        socket = new WebSocket(address);
    } else {
        alert('该浏览器不支持本系统即时通讯功能，推荐使用谷歌或火狐浏览器！');
    }
    layim.config({
        brief: false,// 是否简约模式（如果true则不显示主面板）
        title: '北斗',
        init: {
            url: '/service/chat?path=/chat/getInitList?userId=' + userId,
            data: {}
        },//好友接口
        members: {
            url: '/service/chat?path=/group/getMemberByGroupId',
            data: {}
        },//群员借口
        uploadImage: {
            url: '/service/chat?path=/upload/image?userId=' + userId, //（返回的数据格式见下文）
            type: '' //默认post
        },//上传图片接口
        uploadFile: {
            url: '/service/chat?path=/upload/file?userId=' + userId, //（返回的数据格式见下文）
            type: '' //默认post
        },//上传文件接口
        tool: [{
            alias: 'code',
            title: '代码',
            icon: '&#xe64e;'
        }],//扩展工具栏
        initSkin: '5.jpg', //1-5 设置初始背景
        notice: true, //是否开启桌面消息提醒，默认false
        msgbox: layui.cache.dir + 'css/modules/layim/html/msgbox.html', //消息盒子页面地址，若不开启，剔除该项即可
        find: layui.cache.dir + 'css/modules/layim/html/find.html', //发现页面地址，若不开启，剔除该项即可
        chatLog: layui.cache.dir + 'css/modules/layim/html/chatLog.html', //聊天记录页面地址，若不开启，剔除该项即可
    });

    // 连接发生错误的回调方法
    socket.onerror = function () {
        console.log("连接服务器失败!");
    };
    // 连接成功建立的回调方法
    socket.onopen = function (event) {
        var obj = {
            "content": "online",
            "userId": userId,
            "to": {
                "type": "login"
            }
        }
        console.log(JSON.stringify(obj));
        console.log("socket onopen---ws readyState:" + socket.readyState);
        socket.send(JSON.stringify(obj));  	//发送消息到WebSocket服务
    };

    // 接收到消息的回调方法
    socket.onmessage = function (res) {
        res = eval("(" + res.data + ")");
        console.log("收到消息啦:" + res);
        if (res.type == 'friend' || res.type == 'group') {
            layim.getMessage(res);
        } else {
            layim.setFriendStatus(res.id, res.content);
        }
    };

    // 连接关闭的回调方法
    socket.onclose = function () {
        offline();
        console.log("关闭连接!");
    };
    // 监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        offline();
        socket.close();
    };

    function offline() {
        var obj = {
            "content": "offline",
            "userId": userId,
            "to": {
                "type": "close"
            }
        };
        socket.send(JSON.stringify(obj));  	//发送消息到WebSocket服务
    }

    //监听在线状态的切换事件
    layim.on('online', function (data) {
        console.log("online");
        console.log(data);
    });

    //监听签名修改
    layim.on('sign', function (value) {
        console.log(value);
    });

    layim.on('tool(code)', function (insert) {
        layer.prompt({
            title: '插入代码',
            formType: 2,
            shade: 0
        }, function (text, index) {
            layer.close(index);
            insert('[pre class=layui-code]' + text + '[/pre]'); //将内容插入到编辑器
        });
    });

    //监听layim建立就绪
    layim.on('ready', function (res) {
        console.log('ready');
        //console.log(res.mine);
        layim.msgbox(5); //模拟消息盒子有新消息，实际使用时，一般是动态获得

        setTimeout(function () {
            //接受消息（如果检测到该socket）
//				layim.getMessage({
//					username: "Hi",
//					avatar: "http://qzapp.qlogo.cn/qzapp/100280987/56ADC83E78CEC046F8DF2C5D0DD63CDE/100",
//					id: "10000111",
//					type: "friend",
//					content: "临时：" + new Date().getTime()
//				});

        }, 3000);
    });

    //监听发送消息
    layim.on('sendMessage', function (data) {
        console.log("onMessage");
        var obj = {
            "mine": {
                "avatar": data.mine.avatar,
                "content": data.mine.content,
                "id": data.mine.id,
                "mine": true,
                "username": data.mine.username
            },
            "to": {
                "avatar": data.to.avatar,
                "id": data.to.id,
                "name": data.to.groupname,
                "sign": data.to.sign,
                "type": data.to.type,
                "username": data.to.username
            }
        };
        console.log(JSON.stringify(obj));
        send(JSON.stringify(obj));  	//发送消息到WebSocket服务
    });


    function send(message) {
        if (!window.WebSocket) {
            alert("浏览器不支持websocket！");
            return;
        }
        if (socket.readyState == WebSocket.OPEN) {
            socket.send(message);
        } else {
            alert("连接尚未开启！")
        }
    }

    //监听查看群员
    layim.on('members', function (data) {
        console.log("members");
        console.log(data);
    });

    //监听聊天窗口的切换
    layim.on('chatChange', function (res) {
        var type = res.data.type;
        console.log(res.data.id)
        if (type === 'friend') {
            //模拟标注好友状态
            //layim.setChatStatus('<span style="color:#FF5722;">在线</span>');
        } else if (type === 'group') {
            //模拟系统消息
            layim.getMessage({
                system: true,
                id: res.data.id,
                type: "group",
                content: '模拟群员' + (Math.random() * 100 | 0) + '加入群聊'
            });
        }
    });

    exports('mychat', {});
});