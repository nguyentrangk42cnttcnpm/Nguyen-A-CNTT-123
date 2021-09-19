using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyLib
{
    /// <summary>
    /// Giải phương trình bậc nhất
    /// </summary>
    /// <param name="a">Tham số a</param>
    /// <param name="b">Tham số b</param>
    /// <param name="x">Nghiệm nếu có của phương trình</param>
    /// <returns>
    /// -1: PT vô nghiệm
    /// 0: PT vsn
    /// 1: PT có 1 nghiệm

   public class MyMath
    {
        /**
         * Mô tả thuật toán chúng ta dùng để code
         */
        public static ketqua ptbn(int a, int b, out float x)
        {
            x = 0;
            if (a == 0)
                if (b == 0)
                    return ketqua.vosonghiem;
                else return ketqua.vonghiem;
            else
            {
                x = (float)-b / a;
                return ketqua.motnghiem;
            }    
        }

        public static long TongNSo(int n)
        {
            long rs = 0;
            for(int i = 0; i<=n;i++)
            {
                rs += (long)i;
            }
            return rs;
        }

        public static long TongNSoVersion2(int n)
        {
            long rs = 0;
            int i = 0;
            while (i<=n)
            {
                rs += i;
                i++;
            }
            return rs;
        }
        
        public static long TongNDeQuy(int n)
        {
            if (n == 0)
                return 0;
            else
                return n + TongNDeQuy(n - 1);
        }
        public enum ketqua
        {
            vonghiem,
            vosonghiem,
            motnghiem,
            hainghiem
        }
    }

    public class Point : Object
    {
        public int x
        {
            get;  set;
        }
        public int y
        {
            get;
            set;
        }
        public Point()
        {
            x = 0; y = 0;
        }
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        public Point(Point p)
        {
            this.x = p.x;
            this.y = p.y;
        }
        /// <summary>
        /// Tính khoảng cách từ điểm hiện tại đến gốc toạ độ
        /// </summary>
        /// <param name="p"></param>
        /// <returns>khoảng cách đến O</returns>
        public double Distance()
        {
            double d = Math.Sqrt(x * x + y * y);
            return d;
        }
        /// <summary>
        /// Tính khoảng cách đến điểm p
        /// Hàm Overloading của hàm Distance
        /// <summary>
        /// <param name="p"></param>
        /// <returns></returns>
        
        public double Distance(Point p)
        {
            double d = Math.Sqrt(Math.Pow(x - p.x, 2) + (y - p.y)*(y - p.y));
            return d;
        }

        /// <summary>
        /// Tính khoảng cách từ a->b
        /// </summary>
        /// <param name="a"></param>
        /// <param name="b"></param>
        /// <returns></returns>
        public static double Distance(Point a, Point b)
        {
            double d = Math.Sqrt(Math.Pow(a.x - b.x, 2) + Math.Pow(a.y - b.y, 2));
            return d;
        }

        public override string ToString()
        {
            return $"tao do diem la ({x},{y})";
        }
    }
}
