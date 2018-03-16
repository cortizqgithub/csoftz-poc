/*----------------------------------------------------------------------------*/
/* Source File:   SERVICEEXTENSIONS.CS                                        */
/* Description:   Extensions for configuring App Services                     */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.16/2018                                                 */
/* Last Modified: Mar.16/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ.                                                */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.16/2018 COQ  File created.
 -----------------------------------------------------------------------------*/

using Account.Owner.Service;
using Account.Owner.Service.Interfaces;
using Microsoft.AspNetCore.Builder;
using Microsoft.Extensions.DependencyInjection;

namespace Account.Owner.Api.Extensions
{
    /// <summary>
    /// Extensions for configuring App Services
    /// </summary>
    public static class ServiceExtensions
    {
        /// <summary>
        /// Configures the CORS Service. Here it is unrestrictive config.
        /// </summary>
        /// <param name="services">Collection of services</param>
        public static void ConfigureCors(this IServiceCollection services)
        {
            services.AddCors(options =>
            {
                options.AddPolicy("CorsPolicy",
                    builder => builder.AllowAnyOrigin()
                    .AllowAnyMethod()
                    .AllowAnyHeader()
                    .AllowCredentials());
            });
        }

        /// <summary>
        /// Configures the IIS Integration.
        /// </summary>
        /// <param name="services">Collection of services</param>
        public static void ConfigureIISIntegration(this IServiceCollection services)
        {
            services.Configure<IISOptions>(options =>
            {

            });
        }

        /// <summary>
        /// Injects the Logger Service to the app container.
        /// </summary>
        /// <param name="services">Collection fo services.</param>
        public static void ConfigureLoggerService(this IServiceCollection services)
        {
            services.AddSingleton<ILoggerManager, LoggerManager>();
        }
    }
}
