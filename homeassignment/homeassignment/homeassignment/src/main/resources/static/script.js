
//submit name with POST request
function submitName() {
    const name = document.getElementById("nameInput").value;

    if(name==""){
      alert("בבקשה הכנס שם");
      return;
    }
    fetch("http://localhost:8080/api/user", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ name })
    })
    .then(() => {
      retrieveName();
    })
    .catch(error => {
    document.getElementById("message").innerText = "שם לא הוזן עדיין.";
  });
    
  }

  function retrieveName()
  {
    fetch("http://localhost:8080/api/user")
    .then(res => res.json())
    .then(data => {
      console.log(data);
      document.getElementById("message").innerText = `שלום, ${data.name}`;
    })
    .catch(error => {
    document.getElementById("message").innerText = "שם לא הוזן עדיין.";
    })
  }
