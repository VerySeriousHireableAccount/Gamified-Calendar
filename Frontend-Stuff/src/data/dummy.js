import React from "react";
import {
  AiOutlineCalendar,
  AiOutlineAreaChart,
  AiOutlineStock,
} from "react-icons/ai";
CgProfile;
import { FiShoppingBag, FiCreditCard } from "react-icons/fi";
import { CgProfile } from "react-icons/cg";
import { BsKanban, BsNewspaper } from "react-icons/bs";
import { BiDrink } from "react-icons/bi";
import { MdLocalGroceryStore } from "react-icons/md";
import { VscSymbolMisc } from "react-icons/vsc";
import exclamationmark from "./images/yellow-mark.png";
import checkmark from "./images/green-checkmark.png";
//Sidebar info
//Determine which header links contain which sublinks
export const links = [
  {
    title: "Dashboard",
    links: [
      //sublinks and its icon within the header links
      {
        name: "streak",
        icon: <FiShoppingBag />,
      },
    ],
  },
  {
    title: "Tasks",
    links: [
      {
        name: "calendar",
        icon: <AiOutlineCalendar />,
      },
      {
        name: "kanban",
        icon: <BsKanban />,
      },
    ],
  },
  {
    title: "Stats",
    links: [
      {
        name: "line",
        icon: <AiOutlineStock />,
      },
      {
        name: "community",
        icon: <AiOutlineAreaChart />,
      },
    ],
  },
];
//Kanband Grid
export const kanbanGrid = [
  { headerText: "Groceries", keyField: "Open", allowToggle: true },

  { headerText: "Work", keyField: "InProgress", allowToggle: true },

  {
    headerText: "Misc",
    keyField: "Misc",
    allowToggle: true,
    isExpanded: false,
  },

  { headerText: "Social", keyField: "Close", allowToggle: true },
];

export const kanbanData = [
  {
    Id: "Task 1",
    Title: "Task - 29001",
    Status: "Open",
    Summary: "Analyze the new requirements gathered from the customer.",
    Type: "Story",
    Priority: "Low",
    Tags: "Analyze,Customer",
    Estimate: 3.5,
    Assignee: "Nancy Davloio",
    RankId: 1,
    Color: "#02897B",
    ClassName: "e-story, e-low, e-nancy-davloio",
  },
  {
    Id: "Task 2",
    Title: "Task - 29002",
    Status: "InProgress",
    Summary: "Improve application performance",
    Type: "Improvement",
    Priority: "Normal",
    Tags: "Improvement",
    Estimate: 6,
    Assignee: "Andrew Fuller",
    RankId: 1,
    Color: "#673AB8",
    ClassName: "e-improvement, e-normal, e-andrew-fuller",
  },
  {
    Id: "Task 3",
    Title: "Task - 29003",
    Status: "Open",
    Summary: "Arrange a web meeting with the customer to get new requirements.",
    Type: "Others",
    Priority: "Critical",
    Tags: "Meeting",
    Estimate: 5.5,
    Assignee: "Janet Leverling",
    RankId: 2,
    Color: "#1F88E5",
    ClassName: "e-others, e-critical, e-janet-leverling",
  },
];
//Calendar
export const scheduleData = [
  {
    Id: 1,
    Subject: "Explosion of Betelgeuse Star",
    Location: "Space Center USA",
    StartTime: "2021-01-10T04:00:00.000Z",
    EndTime: "2021-01-10T05:30:00.000Z",
    CategoryColor: "#1aaa55",
  },
  {
    Id: 2,
    Subject: "Thule Air Crash Report",
    Location: "Newyork City",
    StartTime: "2021-01-11T06:30:00.000Z",
    EndTime: "2021-01-11T08:30:00.000Z",
    CategoryColor: "#357cd2",
  },
  {
    Id: 3,
    Subject: "Blue Moon Eclipse",
    Location: "Space Center USA",
    StartTime: "2021-01-12T04:00:00.000Z",
    EndTime: "2021-01-12T05:30:00.000Z",
    CategoryColor: "#7fa900",
  },
];

export const lineChartData = [
  [
    { x: new Date(2005, 0, 1), y: 21 },
    { x: new Date(2006, 0, 1), y: 24 },
    { x: new Date(2007, 0, 1), y: 36 },
    { x: new Date(2008, 0, 1), y: 38 },
    { x: new Date(2009, 0, 1), y: 54 },
    { x: new Date(2010, 0, 1), y: 57 },
    { x: new Date(2011, 0, 1), y: 70 },
  ],
  [
    { x: new Date(2005, 0, 1), y: 28 },
    { x: new Date(2006, 0, 1), y: 44 },
    { x: new Date(2007, 0, 1), y: 48 },
    { x: new Date(2008, 0, 1), y: 50 },
    { x: new Date(2009, 0, 1), y: 66 },
    { x: new Date(2010, 0, 1), y: 78 },
    { x: new Date(2011, 0, 1), y: 84 },
  ],

  [
    { x: new Date(2005, 0, 1), y: 10 },
    { x: new Date(2006, 0, 1), y: 20 },
    { x: new Date(2007, 0, 1), y: 30 },
    { x: new Date(2008, 0, 1), y: 39 },
    { x: new Date(2009, 0, 1), y: 50 },
    { x: new Date(2010, 0, 1), y: 70 },
    { x: new Date(2011, 0, 1), y: 100 },
  ],
];
//Line chart
export const LinePrimaryXAxis = {
  valueType: "DateTime",
  labelFormat: "y",
  intervalType: "Years",
  edgeLabelPlacement: "Productivity",
  majorGridLines: { width: 0 },
  background: "white",
};

export const LinePrimaryYAxis = {
  labelFormat: "{value}%",
  rangePadding: "None",
  minimum: 0,
  maximum: 100,
  interval: 20,
  lineStyle: { width: 0 },
  majorTickLines: { width: 0 },
  minorTickLines: { width: 0 },
};
//Area chart
export const areaPrimaryXAxis = {
  valueType: "DateTime",
  labelFormat: "y",
  majorGridLines: { width: 0 },
  intervalType: "Years",
  edgeLabelPlacement: "Shift",
  labelStyle: { color: "gray" },
};

export const areaPrimaryYAxis = {
  labelFormat: "{value}%",
  lineStyle: { width: 0 },
  maximum: 4,
  interval: 1,
  majorTickLines: { width: 0 },
  minorTickLines: { width: 0 },
  labelStyle: { color: "gray" },
};
const areaChartData = [
  [
    { x: new Date(2002, 0, 1), y: 2.2 },
    { x: new Date(2003, 0, 1), y: 3.4 },
    { x: new Date(2004, 0, 1), y: 2.8 },
    { x: new Date(2005, 0, 1), y: 1.6 },
    { x: new Date(2006, 0, 1), y: 2.3 },
    { x: new Date(2007, 0, 1), y: 2.5 },
    { x: new Date(2008, 0, 1), y: 2.9 },
    { x: new Date(2009, 0, 1), y: 3.8 },
    { x: new Date(2010, 0, 1), y: 1.4 },
    { x: new Date(2011, 0, 1), y: 3.1 },
  ],
  [
    { x: new Date(2002, 0, 1), y: 2 },
    { x: new Date(2003, 0, 1), y: 1.7 },
    { x: new Date(2004, 0, 1), y: 1.8 },
    { x: new Date(2005, 0, 1), y: 2.1 },
    { x: new Date(2006, 0, 1), y: 2.3 },
    { x: new Date(2007, 0, 1), y: 1.7 },
    { x: new Date(2008, 0, 1), y: 1.5 },
    { x: new Date(2009, 0, 1), y: 2.8 },
    { x: new Date(2010, 0, 1), y: 1.5 },
    { x: new Date(2011, 0, 1), y: 2.3 },
  ],
  [
    { x: new Date(2002, 0, 1), y: 0.8 },
    { x: new Date(2003, 0, 1), y: 1.3 },
    { x: new Date(2004, 0, 1), y: 1.1 },
    { x: new Date(2005, 0, 1), y: 1.6 },
    { x: new Date(2006, 0, 1), y: 2 },
    { x: new Date(2007, 0, 1), y: 1.7 },
    { x: new Date(2008, 0, 1), y: 2.3 },
    { x: new Date(2009, 0, 1), y: 2.7 },
    { x: new Date(2010, 0, 1), y: 1.1 },
    { x: new Date(2011, 0, 1), y: 2.3 },
  ],
];

export const areaCustomSeries = [
  {
    dataSource: areaChartData[0],
    xName: "x",
    yName: "y",
    name: "Timothy",
    opacity: "0.8",
    type: "SplineArea",
    width: "2",
  },
  {
    dataSource: areaChartData[1],
    xName: "x",
    yName: "y",
    name: "You",
    opacity: "0.8",
    type: "SplineArea",
    width: "2",
  },
  {
    dataSource: areaChartData[2],
    xName: "x",
    yName: "y",
    name: "Jane",
    opacity: "0.8",
    type: "SplineArea",
    width: "2",
  },
];
//Nav bar info
//Notification
export const chatData = [
  {
    image: exclamationmark,
    message: "You have 2 tasks for the day",
    desc: "Complete within 6 hours for exp",
    time: "9:08 AM",
  },
  {
    image: exclamationmark,
    message: "You have 4 tasks for the day",
    desc: "Complete within 6 hours for exp",
    time: "11:56 AM",
  },
  {
    image: checkmark,
    message: "Groceries completed",
    desc: "Check your exp",
    time: "4:39 AM",
  },
  {
    image: checkmark,
    message: "Working out completed",
    desc: "Check your exp",
    time: "1:12 AM",
  },
];
//User profile
export const userProfileData = [
  {
    icon: <CgProfile />,
    title: "My Profile",
    desc: "Account Settings",
    iconColor: "#03C9D7",
    iconBg: "#E5FAFB",
  },
  {
    icon: <FiCreditCard />,
    title: "My Tasks",
    desc: "To-do and Daily Tasks",
    iconColor: "rgb(255, 244, 229)",
    iconBg: "rgb(254, 201, 15)",
  },
];
//Streak Dashboard
export const dropdownData = [
  {
    Id: "1",
    Time: "This month",
  },
  {
    Id: "2",
    Time: "Last month",
  },
  {
    Id: "3",
    Time: "September",
  },
];
//Recent task
export const recentTransactions = [
  {
    icon: <MdLocalGroceryStore />,
    amount: "2 days left",
    title: "Trader Joe's run",
    desc: "Groceries",
    iconColor: "#03C9D7",
    iconBg: "#E5FAFB",
    pcColor: "green-600",
  },
  {
    icon: <BsNewspaper />,
    amount: "2 days left",
    title: "Bill Payment",
    desc: "Work",
    iconColor: "rgb(0, 194, 146)",
    iconBg: "rgb(235, 250, 242)",
    pcColor: "red-600",
  },
  {
    icon: <BiDrink />,
    amount: "6 hours left",
    title: "Call Jane",
    desc: "Social",
    iconColor: "rgb(255, 244, 229)",
    iconBg: "rgb(254, 201, 15)",

    pcColor: "green-600",
  },
  {
    icon: <VscSymbolMisc />,
    amount: "6 hours left",
    title: "Bank Transfer",
    desc: "Misc",

    iconColor: "rgb(228, 106, 118)",
    iconBg: "rgb(255, 244, 229)",
    pcColor: "green-600",
  },
  {
    icon: <MdLocalGroceryStore />,
    amount: "1 days left",
    title: "Get dog food",
    desc: "Groceries",
    iconColor: "#03C9D7",
    iconBg: "#E5FAFB",
    pcColor: "red-600",
  },
];
//Productivity Line chart
export const lineCustomSeries = [
  {
    dataSource: lineChartData[0],
    xName: "x",
    yName: "y",
    name: "Productivity",
    width: "2",
    marker: { visible: true, width: 10, height: 10 },
    type: "Line",
  },
];

//Essentials
export const themeColors = [
  {
    name: "blue-theme",
    color: "#1A97F5",
  },
  {
    name: "green-theme",
    color: "#03C9D7",
  },
  {
    name: "purple-theme",
    color: "#7352FF",
  },
  {
    name: "red-theme",
    color: "#FF5C8E",
  },
  {
    name: "indigo-theme",
    color: "#1E4DB7",
  },
  {
    color: "#FB9678",
    name: "orange-theme",
  },
];
