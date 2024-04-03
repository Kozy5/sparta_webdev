const express = require("express");
const app = express();

app.listen(1000, function () {
  console.log("listening on 1000");
});

app.get("/beauty", function (req, res) {
  res.send("뷰티용품 쇼핑 페이지입니다");
});

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/index.html");
});
