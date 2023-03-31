$(function(){
    // サムネールをクリック
    $("#passChange").click(function(){
      // body要素の最後にdiv#bgを追加
      $("body").append('<div id="bg">');     
      // #bgをフェードイン
      $("#bg").fadeIn();
      $(".modal-box").show();
  
      // 背景をクリック
      $("#bg").click(function(){
        // 背景（自分自身）をフェードアウト、完了したら削除
        $(this).fadeOut(function(){
          $(this).remove();
        });
        $(".modal-box").hide();
      });
  
      return false;
    });
  });
  