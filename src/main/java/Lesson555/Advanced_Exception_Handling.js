// npm install readline fs - команда для bash - для  взаимодействия с пользователем и файловой системой
const fs = require('fs');
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// Функция для чтения данных от пользователя
function promptUserData() {
  rl.question('Введите Фамилию Имя Отчество датарождения номертелефона пол (разделенные пробелом): ', (data) => {
    try {
      // Проверка количества введенных данных
      const fields = data.trim().split(' ');
      if (fields.length !== 6) {
        throw new Error('Ошибка: введено недостаточно или слишком много данных.');
      }

      // Парсинг введенных данных и проверка формата
      const [lastName, firstName, middleName, dob, phoneNumber, gender] = fields;
      if (!isValidDate(dob) || !isValidPhoneNumber(phoneNumber) || !isValidGender(gender)) {
        throw new Error('Ошибка: некорректный формат данных.');
      }

      // Форматирование данных
      const formattedData = `<${lastName}><${firstName}><${middleName}><${dob}><${phoneNumber}><${gender}>\n`;

      // Запись данных в файл
      fs.appendFile(`${lastName}.txt`, formattedData, (err) => {
        if (err) throw err;
        console.log('Данные успешно записаны в файл.');
      });
    } catch (error) {
      console.error(error.message);
    } finally {
      rl.close();
    }
  });
}

// Функции для проверки формата данных
function isValidDate(date) {
  const dateRegex = /^\d{2}\.\d{2}\.\d{4}$/;
  return dateRegex.test(date);
}

function isValidPhoneNumber(phoneNumber) {
  const phoneNumberRegex = /^\d+$/;
  return phoneNumberRegex.test(phoneNumber);
}

function isValidGender(gender) {
  return gender === 'f' || gender === 'm';
}

// Запускаем приложение
promptUserData();
