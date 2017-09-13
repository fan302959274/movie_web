function change_list(url) {
    $.ajax({
        type: "GET",
        url: url,
        success: function (data) {
            $('#content').html("");
            $('#content').html(data);
        }
    });
}