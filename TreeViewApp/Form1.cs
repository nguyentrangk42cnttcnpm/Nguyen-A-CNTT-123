using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TreeViewApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            
        }
        void addNode(TreeNode parentNode, string parentDirectory, int level)
        {
            try
            {
                if (level < 5)
                {
                    var directoryInfo = new DirectoryInfo(parentDirectory);
                    var directories = directoryInfo.GetDirectories();
                    if(directories.Length > 0)
                        foreach (var directory in directories)
                        {
                            TreeNode node = new TreeNode(directory.Name);
                            parentNode.Nodes.Add(node);  
                            addNode(node, directory.FullName, level + 1);
                        }
                }
                
            }
            catch
            {

            }
        }

        private void btnTaoCay_Click(object sender, EventArgs e)
        {          
            pictureBox1.Visible = true;

            BackgroundWorker worker = new BackgroundWorker();
            List<TreeNode> ls = new List<TreeNode>();
            worker.DoWork += (t, w) =>
            {
                var drives = Environment.GetLogicalDrives();
                foreach (var drive in drives)
                {
                    TreeNode nodeDrive = new TreeNode(drive);
                    ls.Add(nodeDrive);
                    addNode(nodeDrive, drive, 1);
                }
            };
            worker.RunWorkerCompleted += (t, w) =>
            {
                treeView1.Nodes.AddRange(ls.ToArray());
                pictureBox1.Visible = false;
            };
            worker.RunWorkerAsync();
        }

        List<string> fileanh = new List<string> { ".PNG", ".JPG", ".GIF" };

        private void treeView1_NodeMouseClick(object sender, TreeNodeMouseClickEventArgs e)
        {
            var f = Directory.GetFiles(e.Node.FullPath);
            int i = 0;
            foreach (var tam in f)
            {
                ListViewItem item = new ListViewItem();
                if (fileanh.Contains(Path.GetExtension(tam).ToUpperInvariant()))
                {
                    imageList1.Images.Add(Image.FromFile(tam));
                    item.Text = Path.GetFileName(tam);
                    item.ImageIndex = i;
                    i++;
                    listView1.Items.Add(item);
                }
                listView1.LargeImageList = imageList1;
            }
        }
    }
}
