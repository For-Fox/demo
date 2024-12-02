async function getWeather() {
  const cityInput = document.getElementById('city').value || 'Bielefeld';
  const weatherDiv = document.getElementById('weather');

  try {
      const response = await fetch(`https://wttr.in/${cityInput}`);
      if (!response.ok) throw new Error("Ошибка");

      const data = await response.text();

      weatherDiv.innerHTML = `
          <h2>Погода в городе ${cityInput}</h2>
          <p>${data}</p>
      `;
  } catch (error) {
      weatherDiv.innerHTML = `<p style="color: red;">Ошибка: ${error.message}</p>`;
  }
}