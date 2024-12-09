# Replace ? To Find Real Expression

**Một biểu thức chứa các kí tự ngoặc mở `'('` hoặc ngoặc đóng `')'` được gọi là biểu thức ngoặc đúng nếu chúng đóng mở hợp lý, ví dụ biểu thức `(())` hoặc `()()` đều là biểu thức ngoặc đúng. Với đầu vào là một xâu kí tự độ dài n lưu trong dãy $a_1$, $a_2$, ..., $a_n$ gồm 3 số `0, 1, 2` ứng với 3 loại kí tự là dấu hỏi `'?'` hoặc kí tự ngoặc mở `'('` hoặc ngoặc đóng `')'` , yêu cầu in ra tất cả các trường hợp là biểu thức ngoặc đúng khi thay kí tự dấu hỏi bằng ngoặc đóng hoặc ngoặc mở dưới dạng các con số tương ứng.
Ví dụ 1002 ứng với (??) sẽ in ra 1122 và 1212 ứng với (()) và ()().**

Input

-   Line 1: Ghi số nguyên dương `n` `(1 <= n <= 100)`

-   Line 2: Ghi các số nguyên dương `a`

Output

-   Ghi ra dãy các biểu thức ngoặc đúng

---

**Example:**

> -   Input:

```
4
1 0 0 2
```

> -   Output: `1122 1212`
