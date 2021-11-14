using EFTutorial.DAL;
using EFTutorial.View_Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EFTutorial.BLL
{
    internal class LopHocBLL
    {
        public static List<LopHoc> GetList()
        {
            QLSinhVienModel model = new QLSinhVienModel();
            return model.LopHoc.OrderByDescending(e=>e.Name).ToList();
        } 
        public static List<LopHocVM> GetListVM()
        {
            QLSinhVienModel model = new QLSinhVienModel();
            var ls = model.LopHoc.Select(e => new LopHocVM
            {
                ID = e.ID,
                Name = e.Name,
                TotalStudent = e.SinhViens.Count()
            }).ToList();
            return ls;
        }
        public static void Delete(long idLop)
        {
            QLSinhVienModel model = new QLSinhVienModel();
            var lop = model.LopHoc.Where(e => e.ID == idLop).FirstOrDefault();
            if (lop != null)
                model.LopHoc.Remove(lop);
            else
                throw new Exception("Lớp học không tồn tại");
            model.SaveChanges();
        }
    }
}
