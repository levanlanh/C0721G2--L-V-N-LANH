use quan_li_sinh_vien;
 -- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
 select address , count(student_id) as 'số lượng học viên'
 from student 
 group by address;
 
 -- Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
 select student.student_id, student.student_name, avg(mark)
 from student 
 join mark m on student.student_id = m.student_id
 group by student.student_id,student.student_name;
 
 -- Sử dụng having để xét điều kiện điểm trung bình các môn học phải lớn hơn 15
 select student.student_id, student.student_name, avg(mark)
 from student 
 join mark m on student.student_id = m.student_id
 group by student.student_id,student.student_name
 having avg(mark)>15;
 
 -- Sử dụng Having và All để tìm học viên có điểm trung bình lớn nhất
  select student.student_id, student.student_name, avg(mark)
 from student 
 join mark m on student.student_id = m.student_id
 group by student.student_id,student.student_name
 having avg(mark)>= all (select avg(mark) from mark group by mark.student_id);