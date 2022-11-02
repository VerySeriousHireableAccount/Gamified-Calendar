import React from "react";
import { Link } from "react-router-dom";

import "../../styling/LoginStyling.css";
import { useState, useContext, useEffect } from "react";
import { getMonth } from "../../util";
import CalendarHeader from "../CalendarHeader";
import Sidebar from "../Sidebar";
import Month from "../Month";
import GlobalContext from "../../context/GlobalContext";
import EventModal from "../EventModal";
import "../../App.css";
export default function CalendarPage() {
  const [currenMonth, setCurrentMonth] = useState(getMonth());
  const { monthIndex, showEventModal } = useContext(GlobalContext);

  useEffect(() => {
    setCurrentMonth(getMonth(monthIndex));
  }, [monthIndex]);

  return (
    <React.Fragment>
      {showEventModal && <EventModal />}
      <div className="h-screen flex flex-col">
        <CalendarHeader />
        <div className="flex flex-1">
          <Sidebar />
          <Month month={currenMonth} />
        </div>
      </div>
    </React.Fragment>
  );
}
