use quan_li_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *
from subject 
where subject.credit >= all (select max(credit) from subject);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select subject.sub_name,max(mark.mark)
from subject 
join mark on subject.sub_id = mark.sub_id 
where mark.mark >= all (select mark.mark from mark );

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.student_name, avg(m.mark) as 'điểm trung bình '
from student s
join mark m on s.student_id = m.student_id
group by s.student_name
order by avg(m.mark) desc;

