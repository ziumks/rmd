$(function () {

    $('#rmd1').kumaGauge({
    value: Math.floor((Math.random() * 99) + 1)
    });
    $('#rmd2').kumaGauge({
        value: Math.floor((Math.random() * 99) + 1)
    });

//계기판 값 업데이트
    function rmdUpdObj() {
        rmdUpdating($('.rmd1'));
        rmdUpdating($('.rmd2'));
    };

    function rmdUpdating(obj) {
        $(obj).kumaGauge('update', {
            value: Math.floor((Math.random() * 99) + 1)
        });
    };
});
