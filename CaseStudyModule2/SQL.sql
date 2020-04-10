---- task2
select * from nhanvien where (HoTen like 'h%' or HoTen like 't%' or HoTen like 'k%') and length(HoTen)<15;

---- task3
select * from khachhang where (DiaChi='Đà Nẵng' or DiaChi='Quảng Trị') and (curdate()-NgaySinh>(18*30*365) and curdate()-NgaySinh<(50*30*365));

---- task4
select khachhang.HoVaten, count(hopdong.IDHopDong) as SoLanDatPhong from khachhang inner Join hopdong on khachhang.IDKhachHang=hopdong.IDDichVu
inner join loaikhach on khachhang.IDKhachHang=Te
