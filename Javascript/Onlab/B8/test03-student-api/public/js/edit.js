// define
const username = document.querySelector("#name");
const birthday = document.querySelector("#birthday");
const email = document.querySelector("#email");
const phone = document.querySelector("#phone");

const savebtn =  document.querySelector("#btn-save");
const back =  document.querySelector(".btn.btn-secondary");

let validName = true;
let validBirthday = true;
let validEmail = true;
let validPhone = true;
let user;

// id
let curId = 0;
async function getCurrentUser() {
    
    let path =window.location.search;

    for (let i = 0; i < path.length; i++) {
     
        if (path.charAt(i) == "=") {
         curId = path.slice(i+1, path.length);
        };
      }

      try {
        const res = await axios.get(`/users/${curId}`)
        user = res.data;
        username.value = user.name;
        birthday.value = user.birthday;
        email.value = user.email;
        phone.value = user.phone;
        // console.log(user);
      }

      catch (error) {
       
      }

} 



function editUsersAPI(id) {
    return axios.put(`/users/${id}`, {
     name: username.value,
      email: email.value,
      phone: phone.value,
      birthday: birthday.value
    });
}

function editUsers() {
    try {
        editUsersAPI(curId);
    } catch (error) {
        console.log(error);
    }
}

// validation
function checkValid() {
    let valid = true;
    if (username.value === "") {
        validName = false;
        valid = false;
    }
    if (birthday.value === "") {
        validBirthday = false;
        valid = false;
    }
    if (email.value === "") {
        validEmail = false;

        valid = false;
    }
    if (phone.value === "") {
        validPhone = false;
        valid = false;
    }
    return valid;

}

function warning() {
    document.querySelectorAll(".warning").forEach(el => el.remove());
    if (!validName) {
        username.insertAdjacentHTML("afterend", "<p class='warning'>Tên không được để trống</p>");
    }
    if (!validBirthday) {
        birthday.insertAdjacentHTML("afterend", "<p class='warning'>Ngày sinh không được để trống</p>");
    }
    if (!validEmail) {
        email.insertAdjacentHTML("afterend", "<p class='warning'>Email không được để trống</p>");
    }
    if (!validPhone) {
        phone.insertAdjacentHTML("afterend", "<p class='warning'>Sđt không được để trống</p>");
    }


}

// event handlers
savebtn.addEventListener("click", function(event) {
    if (checkValid()) {
        editUsers();
        console.log("executed?");
        window.location.href = "/";
    } else {
        warning();
    }
})

back.addEventListener("click", function(event) {
    window.location.href = "/";
})


// onload

window.onload = function() {

validName = true;
validBirthday = true;
validEmail = true;
validPhone = true;
},  getCurrentUser();