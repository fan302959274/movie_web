webpackJsonp([14],{r71m:function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var i={name:"layer",mounted:function(){layui.use("layer",function(){var t=layui.jquery,a=layui.layer,e={setTop:function(){var e=this;a.open({type:2,title:"当你选择该窗体时，即会在最顶端",area:["390px","260px"],shade:0,maxmin:!0,offset:[Math.random()*(t(window).height()-300),Math.random()*(t(window).width()-390)],content:"http://layer.layui.com/test/settop.html",btn:["继续弹出","全部关闭"],yes:function(){t(e).click()},btn2:function(){a.closeAll()},zIndex:a.zIndex,success:function(t){a.setTop(t)}})},confirmTrans:function(){a.msg("大部分参数都是可以公用的<br>合理搭配，展示不一样的风格",{time:2e4,btn:["明白了","知道了","哦"]})},notice:function(){a.open({type:1,title:!1,closeBtn:!1,area:"300px;",shade:.8,id:"LAY_layuipro",btn:["火速围观","残忍拒绝"],btnAlign:"c",moveType:1,content:'<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">你知道吗？亲！<br>layer ≠ layui<br><br>layer只是作为Layui的一个弹层模块，由于其用户基数较大，所以常常会有人以为layui是layerui<br><br>layer虽然已被 Layui 收编为内置的弹层模块，但仍然会作为一个独立组件全力维护、升级。<br><br>我们此后的征途是星辰大海 ^_^</div>',success:function(t){t.find(".layui-layer-btn").find(".layui-layer-btn0").attr({href:"http://www.layui.com/",target:"_blank"})}})},offset:function(t){var e=t.data("type"),i=t.text();a.open({type:1,offset:e,id:"layerDemo"+e,content:'<div style="padding: 20px 100px;">'+i+"</div>",btn:"关闭全部",btnAlign:"c",shade:0,yes:function(){a.closeAll()}})}};t("#layerDemo .layui-btn").on("click",function(){var a=t(this),i=a.data("method");e[i]&&e[i].call(this,a)})})}},s={render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("div",[a("blockquote",{staticClass:"layui-elem-quote"},[this._v("\n    大部分演示都在layer独立组件的官网，与内置的layer模块，用法是完全一致的\n  ")]),this._v(" "),a("a",{staticClass:"layui-btn layui-btn-normal",attrs:{href:"http://layer.layui.com/",target:"_blank"}},[this._v("前去layer官网")]),this._v(" "),a("fieldset",{staticClass:"layui-elem-field layui-field-title site-demo-button",staticStyle:{"margin-top":"30px"}},[a("legend",[this._v("特殊例子")])]),this._v(" "),a("div",{staticClass:"site-demo-button",staticStyle:{"margin-bottom":"0"},attrs:{id:"layerDemo"}},[a("blockquote",{staticClass:"layui-elem-quote layui-quote-nm"},[this._v("\n      Tips：为了更清晰演示，每触发下述一个例子之前，都会关闭所有已经演示的层\n    ")]),this._v(" "),a("button",{staticClass:"layui-btn",attrs:{"data-method":"setTop"}},[this._v("多窗口模式，层叠置顶")]),this._v(" "),a("button",{staticClass:"layui-btn",attrs:{"data-method":"confirmTrans"}},[this._v("配置一个透明的询问框")]),this._v(" "),a("button",{staticClass:"layui-btn",attrs:{"data-method":"notice"}},[this._v("示范一个公告层")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"t"}},[this._v("上弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"r"}},[this._v("右弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"b"}},[this._v("下弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"l"}},[this._v("左弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"lt"}},[this._v("左上弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"lb"}},[this._v("左下弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"rt"}},[this._v("右上弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"rb"}},[this._v("右下弹出")]),this._v(" "),a("button",{staticClass:"layui-btn layui-btn-normal",attrs:{"data-method":"offset","data-type":"auto"}},[this._v("居中弹出")])]),this._v(" "),a("fieldset",{staticClass:"layui-elem-field layui-field-title",staticStyle:{"margin-top":"50px"}},[a("legend",[this._v("再次温馨提醒")])]),this._v(" "),a("p",{staticClass:"site-demo-text"},[this._v("\n    本页演示是采用了Layui加载的layer，如果你使用的是独立版的layer，无需通过layui.use('layer')来加载。Layui中的layer与独立版的layer的唯一不同，就是加载方式这一点有所差异，请阅读文档："),a("a",{attrs:{href:"http://www.layui.com/doc/modules/layer.html#use",target:"_blank"}},[this._v("http://www.layui.com/doc/modules/layer.html#use")])])])}]},l=e("Mw9A")(i,s,!1,null,null,null);a.default=l.exports}});