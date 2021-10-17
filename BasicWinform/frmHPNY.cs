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
    public partial class frmHPNY : Form
    {

        public frmHPNY()
        {
            InitializeComponent();
            axWindowsMediaPlayer1.URL = @"F:\Administrator\Music\Happy-New-Year-Nhac-Chuong-ABBA.mp3";
            pictureBox1.Image = Image.FromFile("F:/Thư mục mới/anh/ph1.gif");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        }
    }
}
