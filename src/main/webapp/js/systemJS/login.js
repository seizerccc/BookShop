//$代表document.getelementbyid(id)，相当于get一个元素
$(function(){
        $('#btn_login').click(function()
        {
            //运行一个简单的检查
            if($('#nickname').val()==""||$('#password').val()=="")
            {
                window.alert('提示:用户名或密码不能为空!');
                return;
            }
            else
            {
                var info =
                    {
                        nickName: $("#nickname").val(),
                        password :$("#password").val()
                    }
            }


            $.ajax(
                {
                    type:'post',
                    url:baselocation+"/login",
                    data:info,
                    dataType:'json',
                    success : function (data) {
                        console.log(data);
                        if(data === 1){
                            window.location.href = baselocation + "/home";
                        }
                        else
                        {
                            window.alert('Invalid name or password , debug it!');
                        }
                    }

                }
            )
        });
    }
);

$(function() {
    $('#a_gotoRegister').click(function() {
        window.location.href = baselocation + "/register";
    })
});

$(function() {
    $('#a_gotoHome').click(function() {
        window.location.href = baselocation + "/home";
    })
});