using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BasicWinform.Entities
{
    public class Faculty
    {
        public string Id { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public string Address { get; set; }
        public static List<Faculty> GetList()
        {
            List<Faculty> list = new List<Faculty>();
            list.Add(new Faculty
            {
                Id = "1",
                Name = "Khoa Toán"
            });
            list.Add(new Faculty
            {
                Id = "2",
                Name = "Khoa CNTT" 
            });
            list.Add(new Faculty
            {
                Id = "3",
                Name = "Khoa Báo"
            });
            list.Add(new Faculty
            {
                Id = "4",
                Name = "Khoa địa"
            });
            return list;

        }
    }
}
