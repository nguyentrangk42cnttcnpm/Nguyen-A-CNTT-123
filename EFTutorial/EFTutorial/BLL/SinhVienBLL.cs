using EFTutorial.DAL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EFTutorial.BLL
{
    internal class SinhVienBLL
    {
        public static List<SinhVien> GetList(long idLop)
        {
            QLSinhVienModel model = new QLSinhVienModel();
            return model.SinhVien.Where(e=>e.IDLop == idLop).ToList();
        }
    }
}
