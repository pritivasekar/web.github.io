
function validate() {

    var flag=false;
	var x = aForm.name.value;
    var mobile=aForm.mobile.value;
	var efilter = /^([a-zA-Z0-9\_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    var email=aForm.email.value;
	var str="";

	if(x == '') {
		//alert('Please fill all fields');
        //  return false;
		str+="\nPlease fill name\n"
		flag=true;
	} 
	else if(isNaN(mobile)||mobile.length<10){
        flag = true;
        str+="  Mobile Number is not valid!!\n";
    }
    else if(!efilter.test(email)){
        flag=true;
        str +="  Email is not valid!!!\n";
    }
	 if(flag){
        alert("Warning!!\n"+str);
        return false;
    }
}


/* function call(){
var e=lastIndexof('.');
var d=Indexof('@');
var nam=document.getElementById('name');
var emil=document.getElementById('email');
var mob=document.getElementById('mobile');
var phoneno = /^\d{10}$/;

if(nam.value==""){

  nam.style.border="1px solid red";
  return false;
}
if(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(emil.value)){

  return true;
}else{
  nam.style.border="1px solid red";
  return false;
}
if(mob.value.match(phoneno) && (/^\d{10}$/.test(mob)){

    add.style.border="1px solid red";
    return false;
}

return true;
}

 */
 