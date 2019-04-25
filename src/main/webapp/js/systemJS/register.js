$(function () {
    $('#btn_register').click(function () {
        //检查
        if($('#nickname').val()=="")
        {
            window.alert('提示:昵称不能为空!');
            return;
        }
        if($('#realname').val()=="")
        {
            window.alert('提示:真实姓名不能为空!');
            return;
        }
        if($('#password').val()=="")
        {
            window.alert('提示:密码不能为空!');
            return;
        }
        if($('#phone').val()=="")
        {
            window.alert('提示:联系方式不能为空!');
            return;
        }

        var info= {
            realname : $("#realname").val(),
            nickname : $("#nickname").val(),
            password : $("#password").val(),
            phone : $("#phone").val()
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/register",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 0){
                        window.alert('nice,it worked');
                        window.location.href = baselocation + "/login";
                    }
                    else
                    {
                        window.alert(data);
                    }
                }

            }
        )
        //window.location.href = baselocation + "/login";

    })
})


$(function() {
    $('#a_goLogin').click(function() {
        window.location.href = baselocation + "/login";
    })
});

$(function() {
    $('#a_goRegister').click(function() {
        window.location.href = baselocation + "/register";
    })
});