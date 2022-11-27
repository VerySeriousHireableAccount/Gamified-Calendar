//render calendar matrix
import React from "react";

import "../../styling/LoginStyling.css";
import { useState, useContext, useEffect } from "react"; //hook
import { getMonth } from "../../util"; //import util calendar matrix
import CalendarHeader from "../CalendarHeader";
import Sidebarcalendar from "../Sidebarcalendar";
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
  /*Fragment is invisible parent, not represented as node */
  return (
    <React.Fragment>
      {showEventModal && <EventModal />}
      {/* tailwind class, fill screen height, flex column */}
      <div className="h-screen flex flex-col">
        <CalendarHeader />
        {/* flex-1 cover rest of the page */}
        <div className="flex flex-1">
          <Sidebarcalendar />
          {/*pass current month parameter in*/}
          <Month month={currenMonth} />
        </div>
      </div>
    </React.Fragment>
  );
}
