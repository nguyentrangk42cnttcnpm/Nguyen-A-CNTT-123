using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BasicWinform.Entities
{
    public class Person
    {
        /// <summary>
        /// khoá chính
        /// </summary>
        public string Id { get; set; }
        /// <summary>
        /// tên
        /// </summary>
        public string FirstName { get; set; }
        /// <summary>
        /// họ
        /// </summary>
        public string LastName { get; set; }
        /// <summary>
        /// ngày sinh DOB=day of birth
        /// </summary>
        public DateTime DOB { get; set; }
        /// <summary>
        /// Nơi sinh POB= place of birth
        /// </summary>
        public string POB { get; set; }
        /// <summary>
        /// giới tính
        /// </summary>
        public EGioiTinh Sex { get; set; }
        /// <summary>
        /// quê quán
        /// </summary>
        public string HomeTown { get; set; }
        public string FullName
        {
            get
            {
                return $"{LastName} {FirstName}";
            }
        }
        public string IdFaculty { get; set; }

        /// <summary>
        /// Lấy toàn bộ danh sách sinh viên trong CSDL
        /// </summary>
        public static List<Person> GetList()
        {
            var ls = new List<Person>();
            ls.Add(new Person
            {
                Id = "1",
                FirstName = "Nguyễn",
                LastName = "Dũng",
                DOB = new DateTime(2000, 2, 2),
                POB = "Bệnh viện TW Huế",
                HomeTown = "Thừa Thiên Huế",
                Sex = EGioiTinh.Nam,
                IdFaculty = "1"
            });
            ls.Add(new Person
            {
                Id = "2",
                FirstName = "Nguyễn",
                LastName = "Thị Thảo",
                DOB = new DateTime(2000, 5, 6),
                POB = "Bệnh viện TW Huế",
                HomeTown = "Thừa Thiên Huế",
                Sex = EGioiTinh.Nu,
                IdFaculty = "2"
            });

            return ls;
        }
        /// <summary>
        /// lấy ds sv của một khoa
        /// </summary>
        /// <param name="idFaculty">Mã khoa cần lấy</param>
        /// <returns>ds sv của khoa</returns>
        public static List<Person> GetList(string idFaculty) 
        {
            var ls = GetList();
            var rs = ls.Where(e => e.IdFaculty == idFaculty).ToList();
            return rs;
        }
        /// <summary>
        /// Lấy một sinh viên từ CSDL
        /// </summary>
        /// <param name="id">Mã sinh viên cần lấy</param>
        /// <returns>
        /// Sinh viên có mã tương ứng hoặc null nếu không tìm thấy</returns>

        public static Person Get(string id)
        {
            var dbPerson = GetList();
            ///Linq to SQL
            ///Lamda expression
            var person = dbPerson.Where(p => p.Id == id).FirstOrDefault();
            return person;
        }
    }
    public enum EGioiTinh
    {
        Nam, Nu, Khac
    }
    public class ds
    {
        public string Id { get; set; }
        /// <summary>
        /// cấp
        /// </summary>
        public string Level { get; set; }
        /// <summary>
        /// Trường 
        /// </summary>
        public string school { get; set; }
        /// <summary>
        /// Điểm học tập SS= study score
        /// </summary>
        public float SS { get; set; }
        /// <summary>
        /// Hạnh kiểm cd=conduct
        /// </summary>
        public string cd { get; set; }

        public static List<ds> GetList()
        {
            var ls1 = new List<ds>();
            ls1.Add(new ds
            {
                Id = "1",
                Level = "Cấp 1",
                school = "Trường Tiểu học Phú Thuận 2",
                SS = 8f,
                cd = "Tốt"
            });
            ls1.Add(new ds
            {
                Id = "1",
                Level = "Cấp 2",
                school = "Trường THCS Phú Thuận",
                SS = 9f,
                cd = "Tốt"
            });
            ls1.Add(new ds
            {
                Id = "1",
                Level = "Cấp 3",
                school = "Trường THPT Phan Đăng Lưu",
                SS = 8f,
                cd = "Tốt"
            });
            return ls1;
        }
        public static ds Get(string id)
        {
            var dbds = GetList();
            var ds = dbds.Where(d => d.Id == id).FirstOrDefault();
            return ds;
        }
    }
    public class ds1
    {
        public string Id { get; set; }
        /// <summary>
        /// cấp
        /// </summary>
        public string Level { get; set; }
        /// <summary>
        /// Trường 
        /// </summary>
        public string school { get; set; }
        /// <summary>
        /// Điểm học tập SS= study score
        /// </summary>
        public float SS { get; set; }
        /// <summary>
        /// Hạnh kiểm cd=conduct
        /// </summary>
        public string cd { get; set; }
        public static List<ds1> GetList()
        {
            var ls2 = new List<ds1>();
            ls2.Add(new ds1
            {
                Id = "2",
                Level = " Cấp 1",
                school = "Trường Tiểu học Phú An 1",
                SS = 9.5f,
                cd = "Tốt"
            });
            ls2.Add(new ds1
            {
                Id = "2",
                Level = "Cấp 2",
                school = "Trường THCS Phú An",
                SS = 8f,
                cd = "Tốt"
            });
            ls2.Add(new ds1
            {
                Id = "2",
                Level = "Cấp 3",
                school = "Trường THPH Phan Đăng Lưu",
                SS = 9f,
                cd = "Tốt"
            });
            return ls2;
        }
        public static ds1 Get(string id)
        {
            var dbds1 = GetList();
            var ds1 = dbds1.Where(d => d.Id == id).FirstOrDefault();
            return ds1;
        }
    }
}
