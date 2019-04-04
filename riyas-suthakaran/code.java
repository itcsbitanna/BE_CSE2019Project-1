* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function Registervalidation()
{
	if(document.Register.name.value=="")
	{
		document.Register.name.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Name field is Empty..";
		return false;
	}
        if(document.Register.email.value=="")
	{
		document.Register.email.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Email field is Empty..";
		return false;
	}
        if(document.Register.contact.value=="")
	{
		document.Register.contact.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Contact field is Empty..";
		return false;
	}
        if(document.Register.address.value=="")
	{
		document.Register.address.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Address field is Empty..";
		return false;
	}
        if(document.Register.username.value=="")
	{
		document.Register.username.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "UserName field is Empty..";
		return false;
	}
        if(document.Register.password.value=="")
	{
		document.Register.password.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Password field is Empty..";
		return false;
	}
     return true;
}

function ModifyUserDetails(ID)
{

	if(document.getElementById(ID).style.display=="none")
	{
               Popup.showModal(ID);
        }
       	else
	{
               	Popup.hide(ID);
	}
}

function ChangeUserDetails()
{
	if(document.ChangeDetails.mod_name.value=="")
	{
		document.ChangeDetails.mod_name.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Name field is Empty..";
		return false;
	}
        if(document.ChangeDetails.mod_email.value=="")
	{
		document.ChangeDetails.mod_email.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Email field is Empty..";
		return false;
	}
        if(document.ChangeDetails.mod_contact.value=="")
	{
		document.ChangeDetails.mod_contact.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Contact field is Empty..";
		return false;
	}
        if(document.ChangeDetails.mod_address.value=="")
	{
		document.ChangeDetails.mod_address.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Address field is Empty..";
		return false;
	}
        if(document.ChangeDetails.mod_username.value=="")
	{
		document.ChangeDetails.mod_username.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "UserName field is Empty..";
		return false;
	}
        if(document.ChangeDetails.mod_password.value=="")
	{
		document.ChangeDetails.mod_password.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Password field is Empty..";
		return false;
	}
     return true;
}

function validation()
{
      if(document.EncryptionForm.FileName.value=="")
	{
		document.EncryptionForm.FileName.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Select your file..";
		return false;
	}
        if(document.EncryptionForm.KeyString.value=="")
	{
		document.EncryptionForm.KeyString.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Enter Encryption key..";
		return false;
	}

    return true;
}

function SharePopup(ID,DocId,DocName)
{

	if(document.getElementById(ID).style.display=="none")
	{
               document.getElementById("DocId").value = DocId;
               document.getElementById("Doc_Name").value = DocName;
               document.getElementById("DocName").innerHTML = DocName;
               Popup.showModal(ID);
        }
       	else
	{
                document.getElementById("DocId").value = DocId;
                document.getElementById("Doc_Name").value = DocName;
                 document.getElementById("DocName").innerHTML = DocName;
               	Popup.hide(ID);
	}
}

function searchNames(SearchTxtInputObject, Index, FrmName)
{
    var v = SearchTxtInputObject.value.toLowerCase();
    var rows = document.getElementById(FrmName).getElementsByTagName("tr");
    var on = 0;
    for ( var i = 0; i < rows.length; i++ ) {
            var fullname = rows[i].getElementsByTagName("td");
            fullname = fullname[Index].innerHTML.toLowerCase();
            if ( fullname ) {
                    if ( v.length == 0 || (v.length < 3 && fullname.indexOf(v) == 0) || (v.length >= 3 && fullname.indexOf(v) > -1 ) ) {
                            rows[i].style.display = "";
                            on++;
                    } else {
                            rows[i].style.display = "none";
                    }
            }
    }
}

function Loginvalidation()
{
	if(document.Login.UserName.value=="")
	{
		document.Login.UserName.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Enter Your UserName..";
		return false;
	}
	if(document.Login.Password.value=="")
	{
		document.Login.Password.focus();
		document.getElementById("ErrorRow").style.display = "";
                document.getElementById("ErrorMessage").innerHTML = "Enter Your Password..";
		return false;
	}
	return true;
}
