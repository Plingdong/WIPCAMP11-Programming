/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("กดสิไอสัส");
        int item = 3;
        int limit = 10;
        int amount = 0;
        int menu = sc.nextInt();

        if (menu == 1) {
            if (item < limit) {

                System.out.println("ต้องการเพิ่มอยู่ค่ะ");
                amount = sc.nextInt();

                if (item + amount > limit) {
                    System.out.println("เกินไปแล้วไอสัสตบหัวทิ่มเลย");
                } else {
                    item = amount + item;
                    System.out.println(item);
                }
            } else {
                System.out.println("ไอเท็มเต็มแล้วจะใส่ทำห่าอะไรนักหนา");

            }

        } else if (menu == 2) {
            if (item > 0) {
                System.out.println("ต้องการลบไอควาย");
                int remove = sc.nextInt();
                amount = amount + remove;
                if (item - remove < 0) {
                    System.out.println("ไอเท็มไม่พอให้มึงลบไอควาย");

                } else {
                    item = item - remove;
                    System.out.println("เหลือไอเท็มอยู่" + item);

                }

            } else {
                System.out.println("ไอเท็มไม่พออ๊า");
            }

        } else if (menu == 3) {
            System.out.println("ไอเท็มมีอยู่" + item);
        } else {
            System.out.println("อย่ากดมั่วไอสัส");
        }

    }
}
