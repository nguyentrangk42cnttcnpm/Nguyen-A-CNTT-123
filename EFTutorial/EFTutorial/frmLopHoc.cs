using EFTutorial.BLL;
using EFTutorial.View_Model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EFTutorial
{
    public partial class frmLopHoc : Form
    {
        public frmLopHoc()
        {
            InitializeComponent();
            NapLopHoc();
        }
        void NapLopHoc()
        {
            var ls = LopHocBLL.GetListVM();
            lopHocVMBindingSource.DataSource = ls;
            dataGridView1.DataSource = lopHocVMBindingSource;
        }
        public LopHocVM selectLopHoc
        {
            get
            {
                return lopHocVMBindingSource.Current as LopHocVM;
            }
        }

        private void btnXoa_Click(object sender, EventArgs e)
        {
            if(selectLopHoc != null)
            {
                if (selectLopHoc.TotalStudent == 0)
                {
                    if (MessageBox.Show(
                        "Bạn có thực sự muốn xoá?",
                        "Chú ý",
                        MessageBoxButtons.OKCancel,
                        MessageBoxIcon.Question) == DialogResult.OK)
                    {
                        LopHocBLL.Delete(selectLopHoc.ID);
                        lopHocVMBindingSource.RemoveCurrent();
                        MessageBox.Show("Đã xoá thành công", "Thông báo");
                    }
                }
                else
                    MessageBox.Show("Trong lớp này đang có sinh viên! Không được xoá", "Chú ý");                      
            }
        }
    }
}
