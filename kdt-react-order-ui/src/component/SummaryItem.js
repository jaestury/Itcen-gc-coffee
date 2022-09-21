import React from "react";

export function SummaryItem({ProductName, count}) {
    return (
        <React.Fragment>
            <div className="row">
                <h6 className="p-0">{ProductName} <span className="badge bg-dark text-">{count}개</span></h6>
            </div>
        </React.Fragment>
    )
}