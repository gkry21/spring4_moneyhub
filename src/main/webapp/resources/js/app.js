"use strict";
var app = app || {};
app = (()=>{
	const WHEN_ERR = '호출하는 js파일을 찾을 수 없습니다.';
	let _,js, authjs;
	let run = x =>$.getScript(x+'/resources/js/cmm/router.js',()=>{
			$.extend(new Session(x));
			onCreate();
	});
	let init =()=>{
		_ = $.ctx();
		js = $.js();
		authjs = js +'/cmm/auth.js'
		alert('authjs컨텍스트 값 :'+authjs);
	}
	let onCreate =()=>{
		init()
		$.when(
				$.getScript(authjs)
		)
		.done(()=>{auth.onCreate()}
		)
		.fail(()=>{alert(WHEN_ERR)}
		)
	}
	return {run:run}
})();

//alert('컨텍스트:' +$.ctx());