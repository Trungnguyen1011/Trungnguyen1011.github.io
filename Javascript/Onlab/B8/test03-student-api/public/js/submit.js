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

// id
let existedIds = [];

async function getUsers() {
    try {
        const res = await axios.get("/users");
        existedIds = res.data.map(user => user.id);
        console.log(existedIds);
        renderUI(users);
    } catch (error) {
        console.log(error);
    }
}


function createId() {
    let newId = existedIds[existedIds.length - 1] + 1;
    while (existedIds.includes(newId)) {
        newId += 1;
    }
    existedIds.push(newId);
    return newId;
}

// add new user

function createUsersAPI(name,birthday, email,phone) {
    return axios.post("/users", {
        id: createId(),
        name: name,
      email: email,
      phone: phone,
      birthday: birthday
    });
}

function createUsers() {
    try {
       createUsersAPI(username.value, birthday.value, email.value, phone.value);
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
        createUsers();
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
},  getUsers();