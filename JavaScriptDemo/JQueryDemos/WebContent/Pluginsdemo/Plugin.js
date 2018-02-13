//colorit is the name of the plugin
(function($) {

	// $ works here
	$.fn.colorIt = function() {
		this.css("color", "red").css("fontSize", "42pt");
	}
})(jQuery);