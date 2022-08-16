window.addEventListener("load",function() {
    let time = document.querySelectorAll(".time");
    for (let i = 0; i < time.length; i++) {
        time[i].innerText = formatting(time[i].innerText);
    }
});
function formatting(date) {
    if (date != null) {
        return date.substr(0,date.lastIndexOf("."));
    }
    throw new Error("date cannot be null");
}