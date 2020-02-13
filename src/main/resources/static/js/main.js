$(document).ready(function () {
    $(".menu-icon").on("click", function () {
        $(".menu").toggle();
    })

    $(window).resize(() => {
        if (window.matchMedia('(min-width: 801px)').matches) {
            $(".menu").css('display', 'block')
        }

        if (window.matchMedia('(max-width: 800px)').matches) {
            $(".menu").css('display', 'none')
        }
    });

    // tocbot 관련
    // tocbot.init({
    //     // Where to render the table of contents.
    //     tocSelector: '.js-toc',
    //     // Where to grab the headings to build the table of contents.
    //     contentSelector: '.js-toc-content',
    //     // Which headings to grab inside of the contentSelector element.
    //     headingSelector: 'h1, h2, h3',
    //     // For headings inside relative or absolute positioned containers within content.
    //     hasInnerContainers: true,
    // });
})