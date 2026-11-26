const { add, subtract } = require("../calculator");

test("Addition should return 30", () => {
    expect(add(10, 20)).toBe(30);
});

test("Subtraction should return 10", () => {
    expect(subtract(20, 10)).toBe(10);
});