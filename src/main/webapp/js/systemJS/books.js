
$(function(){
        $('#a_gobook1').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook1').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function(){
        $('#a_gobook2').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook2').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function(){
        $('#a_gobook3').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook3').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function(){
        $('#a_gobook4').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook4').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function(){
        $('#a_gobook5').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook5').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function(){
        $('#a_gobook6').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook6').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function(){
        $('#a_gobook7').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook7').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function(){
        $('#a_gobook8').click(function()
        {
            var info =
                {
                    bookname: $('#a_gobook8').text()
                }

            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/books",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/detail";
                        }
                        else
                        {
                            window.alert('Invalid book , debug it!');
                        }
                    }
                }
            )
        });
    }
);

$(function() {
    $('#a_godetail').click(function() {
        window.location.href = baselocation + "/detail";
    })
});






