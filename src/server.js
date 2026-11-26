const express = require("express");
const { add, subtract } = require("./calculator");

const app = express();

const PORT = 3000;

app.get("/", (req, res) => {
    res.send("Calculator Backend API is running!");
});

app.get("/add", (req, res) => {
    const a = Number(req.query.a);
    const b = Number(req.query.b);

    res.json({
        operation: "addition",
        result: add(a, b)
    });
});

app.get("/subtract", (req, res) => {
    const a = Number(req.query.a);
    const b = Number(req.query.b);

    res.json({
        operation: "subtraction",
        result: subtract(a, b)
    });
});

app.listen(PORT, "0.0.0.0", () => {
    console.log(`Server running on port ${PORT}`);
});