# Staff Management
**Viết chương trình quản lý nhân viên.

Dòng đầu tiên là số lượng nhân viên. Dòng tiếp theo là lương cao nhất, lương của nhân viên không được vượt qua con số này. 

Dòng tiếp theo là lương cơ bản. Dòng tiếp theo là hệ số lương bắt đầu. Dòng tiếp nữa là hệ số lương tăng thêm sau mỗi 5 năm làm việc. (1->5 năm không tăng, 6->10 năm tăng 1, ...)

Cứ 3 dòng tiếp theo sẽ là: tên nhân viên, năm sinh, số năm công tác.

Yêu cầu in ra tên nhân viên, năm sinh, số năm công tác, lương hiện tại của nhân viên trên cùng một dòng. Lương hiện tại được tính là `lương cơ bản * hệ số lương bắt đầu` cộng thêm `lương cơ bản * hệ số lương tăng thêm` thêm vào sau mỗi 5 năm công tác. Nếu lương hiện tại lớn hơn lương cao nhất thì sẽ được gán bằng lương cao nhất.

Cuối cùng in ra tổng lương của tất cả các nhân viên.

---

**Example:**
> - Input:
```
  2
  50000000
  2000000
  5
  3
  A
  1988
  10
  B
  1990
  4
```
> - Output:
`A 1988 10 16000000 B 1990 4 10000000 26000000`
