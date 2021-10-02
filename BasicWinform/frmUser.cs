using BasicWinform.Entities;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BasicWinform
{
    public partial class frmUser : Form
    {
        Person person;
        public frmUser(string idPerson="1")
        {
            InitializeComponent();
            person = Person.Get(idPerson);
            if (person != null)
            {
                //Cách 1
                txtHoVaTen.Text = $"{person.LastName} {person.FirstName}";
                //Cách 2
                txtHoVaTen.Text = person.FullName;
                dtpNgaySinh.Value = person.DOB;
                txtNoiSinh.Text = person.POB;
                if (person.Sex == EGioiTinh.Nam)
                    rdNam.Checked = true;
                else if (person.Sex == EGioiTinh.Nu)
                    rdNu.Checked = true;
                else
                    rdKhac.Checked = true;
                
                txtQueQuan.Text = person.HomeTown;
                
            }
            var ls1 = ds.GetList();
            dsBindingSource.DataSource = ls1;
            gridDslichsuhoctapsv.DataSource = dsBindingSource;
        }

        private void picAvatar_Click(object sender, EventArgs e)
        {
            OpenFileDialog dialog = new OpenFileDialog();
            dialog.Filter = "File ảnh(*.png, *.jpg)|*.png;*.jpg";
            dialog.Title = "Chọn ảnh đại diện";
            if(dialog.ShowDialog() == DialogResult.OK)
            {
                var fileName = dialog.FileName;
                picAvatar.ImageLocation = fileName;
            }
        }

        private void frmUser_Click(object sender, EventArgs e)
        {
            if(cl1.ShowDialog()==DialogResult.OK)
            {
                this.BackColor=cl1.Color;               
            }
            
        }
    }
}
