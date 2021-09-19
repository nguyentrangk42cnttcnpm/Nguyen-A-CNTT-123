using MyLib;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloWorld
{
    class Program
    {
        /**
         * Entry Point
         */
        static void Main(string[] args)
        {
            float x = 0;
            var rs = MyMath.ptbn(20, 10, out x);
            if (rs == MyMath.ketqua.vosonghiem)
                Console.WriteLine("pt co vsn");
            else if (rs == MyMath.ketqua.vonghiem)
                Console.WriteLine("pt vn");
            else
                Console.WriteLine($"pt co nghiem la {x}");

            Console.ReadKey(); 
        }
    }
}
