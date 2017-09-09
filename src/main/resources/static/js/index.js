function change_list(url){
    $.ajax({
        type: "GET",
        url: url,
        success: function(data){
            $('#content').html(data);
        }
    });
}