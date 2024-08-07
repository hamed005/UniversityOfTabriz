function toggleSidebar() {
    const sidebar = document.getElementById("sidebar");
    if (sidebar.style.left === "-290px") {
        sidebar.style.left = "0";
    } else {
        sidebar.style.left = "-290px";
    }

}
function switchHome(){
    window.location.href = "/TeacherPanel";
}
function switchRegisterGrades(){
    window.location.href = "/TeacherPanel/TeacherRegisterGrades";
}
function switchRegisterDailyReport(){
    window.location.href = "/TeacherPanel/TeacherRegisterDailyReport";
}
function switchListofStudents(){
    window.location.href = "/TeacherPanel/TeacherListOfStudents";
}
function switchChooseCourses(){
    window.location.href = "/TeacherPanel/TeacherListOfStudents";
}
function LogOut(){
    $.ajax({
        type: "GET",
        url: "/TeacherPanel/LogOut" ,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (result){
            if (result === true){
                window.location.href = "/Login";
            }
        },error(){
            console.log("error");
        }
    });
}

$(document).ready(function (){
    $.ajax({
        type: "GET",
        url: "/TeacherPanel/TeacherSalaryPayment/getInfo" ,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (result){
            $("#PersonInfo").text(result.nameF + " " + result.nameL);
            $("#faculty1").text(result.faculty);
            $("#status1").text(result.status);
        },error(){
            console.log("error");
        }
    });
})