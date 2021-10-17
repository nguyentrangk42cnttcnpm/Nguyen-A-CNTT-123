
namespace BasicWinform
{
    partial class frmTime
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.label1 = new System.Windows.Forms.Label();
            this.btndung = new System.Windows.Forms.Button();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.label3 = new System.Windows.Forms.Label();
            this.lblTime = new System.Windows.Forms.Label();
            this.btnbatdau = new System.Windows.Forms.Button();
            this.numTimer = new System.Windows.Forms.NumericUpDown();
            this.timer2 = new System.Windows.Forms.Timer(this.components);
            this.label2 = new System.Windows.Forms.Label();
            this.lblTime2 = new System.Windows.Forms.Label();
            this.btntieptuc = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.numTimer)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("UVN Sach Vo", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(392, 28);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(87, 48);
            this.label1.TabIndex = 0;
            this.label1.Text = "Còn";
            // 
            // btndung
            // 
            this.btndung.BackColor = System.Drawing.SystemColors.Control;
            this.btndung.Font = new System.Drawing.Font("UVN Sach Vo", 11F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btndung.ForeColor = System.Drawing.Color.SteelBlue;
            this.btndung.Location = new System.Drawing.Point(762, 423);
            this.btndung.Name = "btndung";
            this.btndung.Size = new System.Drawing.Size(147, 60);
            this.btndung.TabIndex = 1;
            this.btndung.Text = "Dừng";
            this.btndung.UseVisualStyleBackColor = false;
            this.btndung.Click += new System.EventHandler(this.btndung_Click);
            // 
            // timer1
            // 
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("UVN Sach Vo", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.SystemColors.ControlText;
            this.label3.Location = new System.Drawing.Point(241, 304);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(432, 48);
            this.label3.TabIndex = 0;
            this.label3.Text = "là đến Tết Âm lịch 2022";
            // 
            // lblTime
            // 
            this.lblTime.AutoSize = true;
            this.lblTime.BackColor = System.Drawing.SystemColors.Control;
            this.lblTime.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblTime.Font = new System.Drawing.Font("UVN Sach Vo", 36F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTime.ForeColor = System.Drawing.Color.SteelBlue;
            this.lblTime.Location = new System.Drawing.Point(34, 128);
            this.lblTime.Name = "lblTime";
            this.lblTime.Size = new System.Drawing.Size(372, 101);
            this.lblTime.TabIndex = 0;
            this.lblTime.Text = "00:00:00";
            // 
            // btnbatdau
            // 
            this.btnbatdau.BackColor = System.Drawing.SystemColors.Control;
            this.btnbatdau.Font = new System.Drawing.Font("UVN Sach Vo", 11F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnbatdau.ForeColor = System.Drawing.Color.SteelBlue;
            this.btnbatdau.Location = new System.Drawing.Point(409, 423);
            this.btnbatdau.Name = "btnbatdau";
            this.btnbatdau.Size = new System.Drawing.Size(147, 60);
            this.btnbatdau.TabIndex = 2;
            this.btnbatdau.Text = "Bắt đầu";
            this.btnbatdau.UseVisualStyleBackColor = false;
            this.btnbatdau.Click += new System.EventHandler(this.btnbatdau_Click);
            // 
            // numTimer
            // 
            this.numTimer.Font = new System.Drawing.Font("Microsoft Sans Serif", 11F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.numTimer.Location = new System.Drawing.Point(154, 437);
            this.numTimer.Maximum = new decimal(new int[] {
            1000,
            0,
            0,
            0});
            this.numTimer.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.numTimer.Name = "numTimer";
            this.numTimer.Size = new System.Drawing.Size(77, 32);
            this.numTimer.TabIndex = 3;
            this.numTimer.ThousandsSeparator = true;
            this.numTimer.Value = new decimal(new int[] {
            1,
            0,
            0,
            0});
            // 
            // timer2
            // 
            this.timer2.Interval = 1000;
            this.timer2.Tick += new System.EventHandler(this.timer2_Tick);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("UVN Sach Vo", 11F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(26, 438);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(120, 30);
            this.label2.TabIndex = 4;
            this.label2.Text = "Thời gian:";
            // 
            // lblTime2
            // 
            this.lblTime2.AutoSize = true;
            this.lblTime2.Font = new System.Drawing.Font("UVN Sach Vo", 11F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTime2.Location = new System.Drawing.Point(274, 438);
            this.lblTime2.Name = "lblTime2";
            this.lblTime2.Size = new System.Drawing.Size(72, 30);
            this.lblTime2.TabIndex = 5;
            this.lblTime2.Text = "00:00";
            // 
            // btntieptuc
            // 
            this.btntieptuc.BackColor = System.Drawing.SystemColors.Control;
            this.btntieptuc.Font = new System.Drawing.Font("UVN Sach Vo", 11F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btntieptuc.ForeColor = System.Drawing.Color.SteelBlue;
            this.btntieptuc.Location = new System.Drawing.Point(586, 423);
            this.btntieptuc.Name = "btntieptuc";
            this.btntieptuc.Size = new System.Drawing.Size(147, 60);
            this.btntieptuc.TabIndex = 6;
            this.btntieptuc.Text = "Tiếp tục";
            this.btntieptuc.UseVisualStyleBackColor = false;
            this.btntieptuc.Click += new System.EventHandler(this.btntieptuc_Click);
            // 
            // frmTime
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.LightBlue;
            this.ClientSize = new System.Drawing.Size(935, 509);
            this.Controls.Add(this.btntieptuc);
            this.Controls.Add(this.lblTime2);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.numTimer);
            this.Controls.Add(this.btnbatdau);
            this.Controls.Add(this.btndung);
            this.Controls.Add(this.lblTime);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label1);
            this.Name = "frmTime";
            this.Text = "CountDown";
            this.Load += new System.EventHandler(this.frmTime_Load);
            ((System.ComponentModel.ISupportInitialize)(this.numTimer)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btndung;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label lblTime;
        private System.Windows.Forms.Button btnbatdau;
        private System.Windows.Forms.NumericUpDown numTimer;
        private System.Windows.Forms.Timer timer2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label lblTime2;
        private System.Windows.Forms.Button btntieptuc;
    }
}