using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Media;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BasicWinform
{
    public partial class frmTime : Form
    {
        public frmTime()
        {
            InitializeComponent();
        }  
        private void timer1_Tick(object sender, EventArgs e)
        {
            TimeSpan ts = endTime.Subtract(DateTime.Now);
                    
            if (ts.TotalSeconds <= 0)
            {
                timer1.Stop();
                var f = new frmHPNY();
                f.Show();
            }
            else
            {               
                lblTime.Text = ts.ToString("dd' Ngày, 'hh' : 'mm' : 'ss");
            }

        }
        private void timer2_Tick(object sender, EventArgs e)
        {            
            if (totalsecond == 0)
            {
                timer2.Stop();
                var f = new frmHPNY();
                f.Show();
            }
            else
            {
                totalsecond--;
                lblTime2.Text = $"{totalsecond/60:0#}:{totalsecond % 60:0#}";
            }
        }
        int totalsecond = 0;
        private void btnbatdau_Click(object sender, EventArgs e)
        {
            var minute = (int)numTimer.Value;
            totalsecond = minute * 60;
            timer2.Start();
        }
        private void btntieptuc_Click(object sender, EventArgs e)
        {
            timer1.Start();
        }
        private void btndung_Click(object sender, EventArgs e)
        {
            timer1.Stop();
        }

        DateTime endTime = new DateTime(2022, 02, 01, 00, 00, 00);
        private void frmTime_Load(object sender, EventArgs e)
        {
            TimeSpan ts = endTime.Subtract(DateTime.Now);
            lblTime.Text = ts.ToString("dd' Ngày, 'hh' : 'mm' : 'ss");            
            timer1.Start();
        }

        
    }
}
