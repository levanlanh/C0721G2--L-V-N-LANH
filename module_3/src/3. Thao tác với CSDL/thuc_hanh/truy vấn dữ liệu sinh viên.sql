use quan_li_sinh_vien;
select * from student ;
select * from student 
where status = true;
select * from subject
where credit < 10;

SELECT s.student_Id, s.student_name, c.class_name
FROM student s join class c on s.class_Id = c.class_ID;
SELECT s.student_Id, s.student_name, c.class_name
FROM student s join class c on s.class_Id = c.class_ID
WHERE c.class_name = 'A1';

SELECT s.student_Id, s.student_name, sub.sub_name, m.mark
FROM student s join mark m on s.student_Id = m.student_Id join subject sub on m.sub_Id = sub.sub_Id;
SELECT s.student_Id, s.student_name, sub.sub_name, m.mark
FROM student s join mark m on s.student_Id = s.student_Id join subject sub on m.sub_Id = sub.sub_Id
WHERE sub.sub_name = 'CF';