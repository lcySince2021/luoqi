$(document).ready(function(e) {
	t = $('.content').offset().top;
	mh = $('.big').height();
	fh = $('.content').height();
	$(window).scroll(function(e){
		s = $(document).scrollTop();
		if(s > t - 10){
			$('.content').css('position','fixed');
			if(s + fh > mh){
				$('.content').css('top',mh-s-fh+'px');
			}
		}else{
			$('.content').css('position','');
		}
	})
})
// $(function () {
// 	var num=$(".wenzi").html();
// 	if (num.length>10){
// 		$(".wenzi").html(num.substr(0,10)+"...")
// 	}
// })
