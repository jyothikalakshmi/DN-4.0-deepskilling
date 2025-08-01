import React from 'react';

function GuestPage() {
  const flights = [
    { id: 1, from: 'Bangalore', to: 'Chennai', time: '10:00 AM' },
    { id: 2, from: 'Mumbai', to: 'Hyderabad', time: '12:30 PM' }
  ];

  return (
    <div>
      <h2>Please sign up</h2>
      <h3>Available Flights:</h3>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
            {flight.from} → {flight.to} at {flight.time}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default GuestPage;
