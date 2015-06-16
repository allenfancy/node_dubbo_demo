var express = require('express');
var app = express();
var path = require('path');
var mongoose = require("mongoose");
var Proxy = require('hessian-proxy').Proxy;

var bodyParser = require('body-parser');
var multer = require('multer');
var session = require('express-session');

app.use(session({
	secret:'secret',
	cookie:{
		maxAge:1000*60*30
	}
}));

//设定views变量，意思是视图存放的目录
app.set('views',path.join(_dirname,'views'));

//设定views变量，意为网页模板引擎
app.set('view engine','html');
app.engine('.html',require('ejs')._express);


app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:true}));
app.use(multer());

//存放静态文件目录，比如本地文件
app.use(express.static(path.join(_dirname,'public')));


var proxy = new Proxy('http://127.0.0.1:8080/node_dubbo_server/provider/com.yuanxin.paas.ssb.TestService', '', '', proxy);


app.listen(3000，function(){
	console.log('start success');
});







