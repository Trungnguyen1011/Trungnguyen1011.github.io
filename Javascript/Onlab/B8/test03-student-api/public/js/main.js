const users_list = document.querySelector("tbody");

const cancelBtn = document.querySelector("#cancel-btn");
const confirmBtn = document.querySelector("#confirm-btn");

let users = [];
let deleteId = -1;
function getUsersAPI() {
  return axios.get("/users");
}

function deleteUsersAPI(id) {
  return axios({
    method: "delete",
    url: `/users/${id}`,
  });
}

function renderUI(arr) {
  users_list.innerHTML = "";

  if (arr.length == 0) {
    users_list.innerHTML = "Danh sasch trống";
    return;
  }

  for (let i = 0; i < arr.length; i++) {
    const t = arr[i];
    users_list.innerHTML += `
        <tr>
        <td>${t.name}</td>
        <td>${t.birthday}</td>
        <td>${t.email}</td>
        <td>${t.phone}</td>
        <td>
            <a href="/edit.html?id=${t.id}" class="text-info"><i class="fa fa-edit"></i> Chỉnh sửa</a>
            |
            <a class="text-danger" data-toggle="modal" data-target="#confirm" onclick="deleteHandler(${t.id})"><i class="fa fa-trash-alt"></i> Xóa</a>
        </td>
    </tr>
        `;
  }
}

async function getUsers() {
  console.log(users_list);
  try {
    const res = await getUsersAPI();
    users = res.data;

    renderUI(users);
  } catch (error) {
    console.log(error);
  }
}

async function deleteUser(id) {
  try {
    await deleteUsersAPI(id);
    users.forEach((u, index) => {
      if (u.id == id) {
        users.splice(index, 1);
      }
    });

    renderUI(users);
   
  } catch (error) {
    console.log(error);
  }
}

function deleteHandler(id) {
     
    deleteId= id;
    
}

  confirmBtn.addEventListener("click", function(event) {
    deleteUser(deleteId);
    deleteId = -1;
  });




window.onload = () => {
  getUsers();
};
