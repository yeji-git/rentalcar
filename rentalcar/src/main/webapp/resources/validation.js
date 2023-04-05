function checkValues (htmlForm) {
    let url = "join?";

    const client_id = document.getElementById("client_id").value;
    const password = document.getElementById("password").value;
    const name = document.getElementById("name").value;
    const phone = document.getElementById("phone").value;
    const address = document.getElementById("address").value;

    let check = true;

    if (client_id !== "") {
        url += "&client_id" + client_id;
    }
    if (password !== "") {
        url += "&password" + password;
    }    
    if (name !== "") {
        url += "&name" + name;
    }
    if (phone !== "") {
        url += "&phone" + phone;
    }
    if (address !== "") {
        url += "&address" + address;
    }    

    if (client_id === "") {
        alert('아이디가 입력되지 않았습니다.');
        check = false;
    } else if (password === "") {
        alert('비밀번호가 입력되지 않았습니다.');
        check = false;
    } else if (name === "") {
        alert('이름이 입력되지 않았습니다.');
        check = false;
    } else if (phone === "") {
        alert('휴대전화가 입력되지 않았습니다.');
        check = false;
    } else if (address === "") {
        alert('주소가 입력되지 않았습니다.');
        check = false;
    }

    if (check === false) {
        location.href = `${url}`;
    } else {
        alert('회원가입이 완료되었습니다.');
        htmlForm.submit();
    }

}