import dayjs from "dayjs"; //library to manipulate time
//month number 0-11, passing current month
export function getMonth(month = dayjs().month()) {
  month = Math.floor(month);
  const year = dayjs().year(); //current year
  const firstDayOfTheMonth = dayjs(new Date(year, month, 1)).day();
  //negative number will go to month before and get ith day from the end
  //this represent the day in every month, if firstDayOfTheMonth is mon, become -1
  //then the row will be 1st to last, firstDayOfTheMonth, secondDayOfTheMonth
  let currentMonthCount = 0 - firstDayOfTheMonth;
  //two dimensional array to store days, 5 row, 7 column for days of week
  const daysMatrix = new Array(5).fill([]).map(() => {
    return new Array(7).fill(null).map(() => {
      currentMonthCount++; //increase each column loop and row loop
      return dayjs(new Date(year, month, currentMonthCount));
    });
  });
  return daysMatrix;
}
